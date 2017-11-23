<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="tb" style="padding:3px">
    <span>所属专辑id:</span>
    <input id="id" style="line-height:26px;border:1px solid #ccc">
    <a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch()">搜索</a>
</div>

<table class="easyui-datagrid" id="albuminfo" title="专辑信息"
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/album/findinfo',method:'get',pageSize:30,toolbar:toolbar">
    <thead>
        <tr>

        	<th data-options="field:'albuminfoId',width:200">专辑infoid</th>
            <th data-options="field:'cookId',width:200">菜谱id</th>
            <th data-options="field:'albumId',width:200">所属专辑</th>


        </tr>
    </thead>
</table>

<script>

    function getSelectionsIds(){
    	var itemList = $("#albuminfo");
    	var sels = itemList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].albuminfoId);
    	}
    	ids = ids.join(",");

    	return ids;
    }
    
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$(".tree-title:contains('添加专辑信息')").parent().click();
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var ids = getSelectionsIds();
        	alert(ids)
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除ID为 '+ids+' 的商品吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("/album/deleteinfo?id="+ids,params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除商品成功!',undefined,function(){
            					$("#albuminfo").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];

    function doSearch(){
        $('#albuminfo').datagrid('load',{
            id: $('#id').val(),

        });
    }
</script>