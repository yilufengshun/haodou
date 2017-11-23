<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>淘淘商城后台管理系统</title>
<link rel="stylesheet" type="text/css" href="/js/jquery-easyui-1.5/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="/js/jquery-easyui-1.5/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="/css/taotao.css" />
<script type="text/javascript" src="/js/jquery-easyui-1.5/jquery.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="/js/common.js"></script>
<style type="text/css">
	.content {
		padding: 10px 10px 10px 10px;
	}
</style>
</head>
<body class="easyui-layout">
	<div data-options="region:'north'" style="height:70px;text-align:center">
		<h1>好豆网后台管理系统</h1>
    </div>   
    <div data-options="region:'south'" style="height:50px;text-align:center">
    	共享版本V1.0
    </div> 
    <div data-options="region:'west',title:'菜单',split:true" style="width:180px;">
    	<ul id="menu" class="easyui-tree" style="margin-top: 10px;margin-left: 5px;">
         	<li>
         		<span>用户管理</span>
         		<ul>
	         		<li data-options="attributes:{'url':'item-add.jsp'}">添加用户</li>
	         		<li data-options="attributes:{'url':'item-list.jsp'}">查看用户</li>
	         		<%--<li data-options="attributes:{'url':'item-param-list'}">规格参数</li>--%>
	         	</ul>
         	</li>
         	<li>
         		<span>专辑管理</span>
         		<ul>
	         		<li data-options="attributes:{'url':'album-add.jsp'}">添加专辑</li>
	         		<li data-options="attributes:{'url':'album-list.jsp'}">查看专辑</li>
					<li data-options="attributes:{'url':'album-infoadd.jsp'}">添加专辑信息</li>
					<li data-options="attributes:{'url':'album-info.jsp'}">查看专辑信息</li>
	         	</ul>
         	</li>
			<li>
				<span>分组管理</span>
				<ul>
					<li data-options="attributes:{'url':'group-add.jsp'}">添加分组</li>
					<li data-options="attributes:{'url':'group-list.jsp'}">查看分组</li>
				</ul>
			</li>
			<li>
				<span>菜谱管理</span>
				<ul>
					<li data-options="attributes:{'url':'content-category'}">添加菜谱</li>
					<li data-options="attributes:{'url':'content'}">查看菜谱</li>
				</ul>
			</li>
			<li>
				<span>话题管理</span>
				<ul>
					<li data-options="attributes:{'url':'content-category'}">添加话题</li>
					<li data-options="attributes:{'url':'content'}">查看话题</li>
				</ul>
			</li>
			<li>
				<span>食材管理</span>
				<ul>
					<li data-options="attributes:{'url':'content-category'}">添加食材</li>
					<li data-options="attributes:{'url':'content'}">查看分组</li>
				</ul>
			</li>
         </ul>
    </div>
    <div data-options="region:'center',title:''">
    	<div id="tabs" class="easyui-tabs">
		    <div title="首页" style="padding:20px;">
				欢迎来到好豆网后台！！！！
		    </div>
		</div>
    </div>
    
<script type="text/javascript">
$(function(){
	$('#menu').tree({
		onClick: function(node){
			if($('#menu').tree("isLeaf",node.target)){
				var tabs = $("#tabs");
				var tab = tabs.tabs("getTab",node.text);
				if(tab){
					tabs.tabs("select",node.text);
				}else{
					tabs.tabs('add',{
					    title:node.text,
					    href: node.attributes.url,
					    closable:true,
					    bodyCls:"content"
					});
				}
			}
		}
	});
});
</script>
</body>
</html>