var n = 0;
function display() {
	n++;
	if(n == 4) 
		n = 1;
	document.getElementById("pic").innerHTML = '<img src="image/homePage' + n + '.jpg"  />';
	setTimeout("display()",2000);
}

$(document).ready(function() {
	
  $("#li2").mouseover(function() {
    $(this).attr("class","activeLi");
  });
  
  $("#li3").mouseover(function() {
    $(this).attr("class","activeLi");
  });
  
  $("#li4").mouseover(function() {
    $(this).attr("class","activeLi");
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