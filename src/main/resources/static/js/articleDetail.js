$(document).ready(function() {
	
	$("#userName").mouseover(function() {
		$(this).attr("class","userNameOver");
	});
	
  $("#li1").mouseover(function() {
    $(this).attr("class","activeLi");
  });
  
  $("#li2").mouseover(function() {
    $(this).attr("class","activeLi");
  });
  
  $("#li3").mouseover(function() {
    $(this).attr("class","activeLi");
  });
  
  $("#li4").mouseover(function() {
    $(this).attr("class","activeLi");
  });
  
  $("#userName").mouseout(function() {
		$(this).attr("class","userNameOut");
	});
  
  $("#li1").mouseout(function() {
    $(this).attr("class","");
  });
  
  $("#li2").mouseout(function() {
    $(this).attr("class","");
  });
  
  $("#li3").mouseout(function() {
    $(this).attr("class","");
  });
  
  $("#li4").mouseout(function() {
    $(this).attr("class","");
  });
  
});

function submit() {	
	var comment = document.getElementById("commentText").value;
	if(!(comment === "" || comment === "发表我的评论"))
		alert("发表成功！")
}
