<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="itemList" title="专辑列表"
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/album/findbyname',method:'get',pageSize:30,toolbar:toolbar">
    <thead>
    <div id="tb" style="padding:3px">
        <span>专辑名称:</span>
        <input id="albumname" style="line-height:26px;border:1px solid #ccc">
        <a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch()">搜索</a>
    </div>
        <tr>

        	<th data-options="field:'albumId',width:60">专辑id</th>
            <th data-options="field:'albumIntro',width:200">专辑简介</th>
            <th data-options="field:'albumTap',width:100">专辑标签</th>
            <th data-options="field:'userId',width:100">所属用户</th>


        </tr>
    </thead>
</table>
<div id="itemEditWindow" class="easyui-window" title="编辑专辑" data-options="modal:true,closed:true,iconCls:'icon-save',href:'/jsp/album-edit.jsp'" style="width:80%;height:80%;padding:10px;">
</div>
<div id="infoEditWindow" class="easyui-window" title="编辑专辑信息" data-options="modal:true,closed:true,iconCls:'icon-save',href:'/jsp/album-info.jsp'" style="width:80%;height:80%;padding:10px;">
</div>
<input id="album" type="hidden">
<script>

    function getSelectionsIds(){
    	var itemList = $("#itemList");
    	var sels = itemList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].albumId);
    	}
    	alert(ids);
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$(".tree-title:contains('添加专辑')").parent().click();
        }
    },{
        text:'编辑',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getSelectionsIds();

        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一个专辑才能编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','专辑!');
        		return ;
        	}
                $("#itemEditWindow").window({
        		onLoad :function(){

        		    //回显数据
        			var data = $("#itemList").datagrid("getSelections")[0];
        			//data.priceView = TAOTAO.formatPrice(data.price);

        			$("#itemeEditForm").form("load",data);
        			
        			// 加载商品描述
//        			$.getJSON('/rest/item/query/item/desc/'+data.id,function(_data){
//        				if(_data.status == 200){
//        					//UM.getEditor('itemeEditDescEditor').setContent(_data.data.itemDesc, false);
//        					itemEditEditor.html(_data.data.itemDesc);
//        				}
//        			});
        			
        			//加载商品规格
//        			$.getJSON('/rest/item/param/item/query/'+data.id,function(_data){
//        				if(_data && _data.status == 200 && _data.data && _data.data.paramData){
//        					$("#itemeEditForm .params").show();
//        					$("#itemeEditForm [name=itemParams]").val(_data.data.paramData);
//        					$("#itemeEditForm [name=itemParamId]").val(_data.data.id);
//
//        					//回显商品规格
//        					 var paramData = JSON.parse(_data.data.paramData);
//
//        					 var html = "<ul>";
//        					 for(var i in paramData){
//        						 var pd = paramData[i];
//        						 html+="<li><table>";
//        						 html+="<tr><td colspan=\"2\" class=\"group\">"+pd.group+"</td></tr>";
//
//        						 for(var j in pd.params){
//        							 var ps = pd.params[j];
//        							 html+="<tr><td class=\"param\"><span>"+ps.k+"</span>: </td><td><input autocomplete=\"off\" type=\"text\" value='"+ps.v+"'/></td></tr>";
//        						 }
//
//        						 html+="</li></table>";
//        					 }
//        					 html+= "</ul>";
//        					 $("#itemeEditForm .params td").eq(1).html(html);
//        				}
//        			});
        			
        			TAOTAO.init({
        				"pics" : data.image,
        				"cid" : data.cid,
//        				fun:function(node){
//        					TAOTAO.changeItemParam(node, "itemeEditForm");
//        				}
        			});
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中商品!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除ID为 '+ids+' 专辑？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("/rest/item/delete",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除专辑成功!',undefined,function(){
            					$("#itemList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    },{
        text:'编辑专辑信息',
        iconCls:'icon-edit',
        handler:function(){
            var ids = getSelectionsIds();

            if(ids.length == 0){
                $.messager.alert('提示','必须选择一个专辑才能编辑!');
                return ;
            }
            if(ids.indexOf(',') > 0){
                $.messager.alert('提示','专辑!');
                return ;
            }




            $("#infoEditWindow").window({



                onLoad :function(){
                    //回显数据
                    var data = $("#itemList").datagrid("getSelections")[0];
                    var id=data.albumId;

                    $("#infoform").form("load",data);

                }
            }).window("open");
        }


    },'-',{
        text:'封杀',
        iconCls:'icon-remove',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中用户!');
        		return ;
        	}
        	$.messager.confirm('确认','确定下架ID为 '+ids+' 用户？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("/rest/item/instock",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','封杀用户成功!',undefined,function(){
            					$("#itemList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    },{
        text:'上架',
        iconCls:'icon-remove',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中商品!');
        		return ;
        	}
        	$.messager.confirm('确认','确定上架ID为 '+ids+' 的商品吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("/rest/item/reshelf",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','上架商品成功!',undefined,function(){
            					$("#itemList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];

    function doSearch(){
        $('#itemList').datagrid('load',{
            albumname: $('#albumname').val(),

        });
    }
</script>