function dele(file1) {
    if(confirm("确定要删除吗？")) {
        win1 = window.open("", "dele", "toolbar=no,location=no,width=800,height=400,resizable=yes")
        win1.location.href = "dele.php?file1=" + file1
        location.href = "photo.php";
    }
}

function addPic(picAdd) {
    var div = document.createElement("div");
    div.className = "pic";
    str = '<img src="';
    str = str + picAdd;
    str = str + '" class="photo" /> <span class="delete glyphicon glyphicon-trash"></span>';
    div.innerHTML = str;
    document.getElementById("row").appendChild(div);
}

$(document).ready(function() {
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

