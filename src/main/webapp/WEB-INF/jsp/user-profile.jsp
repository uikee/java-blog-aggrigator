<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<h2>${user.name}</h2>

<c:forEach items="${user.blogs}" var="blog">

	<h2>${blog.name}</h2>
	<p>${blog.url}</p>
	
	<table class="table table-striped table-bordered table-hover table-condensed">
		<thead>
			<tr>
				<td>Title</td>
				<td>Link</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${blog.items}" var="item">
				<tr>
					<td>${item.title}</td>
					<td>${item.link}</td>
				</tr>
			</c:forEach>			
		</tbody>
	</table>

</c:forEach>
 