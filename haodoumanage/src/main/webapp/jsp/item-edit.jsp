<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<script type="text/javascript" src="/js/common.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="itemeEditForm" class="itemForm" method="post">
		<input type="hidden" name="id"/>
	    <table cellpadding="5">
			<tr>
				<td>id:</td>
				<td><input class="easyui-textbox" type="text" name="userId"  readonly="readonly" style="width: 280px;"></input></td>
			</tr>

			<tr>
				<td>用户名称:</td>
				<td><input class="easyui-textbox" type="text" name="userName" data-options="required:true" style="width: 280px;"></input></td>
			</tr>
			<tr>
				<td>用户电话:</td>
				<td><input class="easyui-textbox" type="text" name="userPhone"  style="width: 280px;"></input></td>
			</tr>
			<tr>
				<td>用户密码:</td>
				<td><input class="easyui-textbox" type="text" name="userPassword" data-options="required:true" style="width: 280px;"></input></td>
			</tr>
			<tr>
				<td>真实姓名:</td>
				<td><input class="easyui-textbox" type="text" name="relName"  style="width: 280px;"></input></td>
			</tr>
			<tr>
				<td>出生日期:</td>
				<td ><input   class="easyui-textbox" type="date" name="birthday"  style="width: 280px;" id="birthday"></input></td>
			</tr>
			<tr>
				<td>星座:</td>
				<td><input class="easyui-textbox" type="text" name="zodiac"  style="width: 280px;"></input></td>
			</tr>
			<tr>
				<td>毕业学校:</td>
				<td><input class="easyui-textbox" type="text" name="school"  style="width: 280px;"></input></td>
			</tr>
			<tr>
				<td>血型:</td>
				<td><input class="easyui-textbox" type="text" name="bloodType"  style="width: 280px;"></input></td>
			</tr>
			<tr>
				<td>地址:</td>
				<td><input class="easyui-textbox" type="text" name="address"  style="width: 280px;"></input></td>
			</tr>
			<tr>
				<td>工作:</td>
				<td><input class="easyui-textbox" type="text" name="job"  style="width: 280px;"></input></td>
			</tr>
			tr>
			<td>email:</td>
			<td><input class="easyui-textbox" type="text" name="email"  style="width: 280px;"></input></td>
			</tr>
			<tr>
				<td>学历:</td>
				<td><input class="easyui-textbox" type="text" name="educational"  style="width: 280px;"></input></td>
			</tr>
			<tr>
				<td>爱好:</td>
				<td><input class="easyui-textbox" type="text" name="hobby"  style="width: 280px;"></input></td>
			</tr>


			<tr>
				<td>用户头像:</td>
				<td>
					<a href="javascript:void(0)" class="easyui-linkbutton picFileUpload">上传图片</a>
					<input type="hidden" name="avator"/>
				</td>
			</tr>
			<tr>
				<td>简介:</td>
				<td>
					<textarea style="width:800px;height:300px;" name="introduction"></textarea>
				</td>
			</tr>
	    </table>
	    <input type="hidden" name="itemParams"/>
	    <input type="hidden" name="itemParamId"/>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	</div>
</div>
<script type="text/javascript">
	var itemEditEditor ;
	//var day=TAOTAO.formatDateTime($("#birthday"));
	//alert(day);
	//$("#birthday").val(day);
	$(function(){
		//实例化编辑器
		itemEditEditor = TAOTAO.createEditor("#itemeEditForm [name=desc]");
	});

	
	function submitForm(){
		if(!$('#itemeEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
	//	$("#itemeEditForm [name=price]").val(eval($("#itemeEditForm [name=priceView]").val()) * 1000);
	//	itemEditEditor.sync();
		
		var paramJson = [];
		$("#itemeEditForm .params li").each(function(i,e){
			var trs = $(e).find("tr");
			var group = trs.eq(0).text();
			var ps = [];
			for(var i = 1;i<trs.length;i++){
				var tr = trs.eq(i);

				ps.push({
					"k" : $.trim(tr.find("td").eq(0).find("span").text()),
					"v" : $.trim(tr.find("input").val())
				});
			}
			paramJson.push({
				"group" : group,
				"params": ps
			});
		});
		paramJson = JSON.stringify(paramJson);
		
		$("#itemeEditForm [name=itemParams]").val(paramJson);
		
		$.post("/user/edit",$("#itemeEditForm").serialize(), function(data){
		    alert(data.status);
			if(data.status == 200){
				$.messager.alert('提示','修改成功!','info',function(){
					$("#itemEditWindow").window('close');
					$("#itemList").datagrid("reload");
				});
			}
		});
	}



</script>
