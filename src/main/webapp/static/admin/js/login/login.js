// 登录js
$(document).ready(function() {

}

function checkusername() {
    var username = $("#username").val();

    alert(username);

    if (username == null || username ==""){
        alert("请输入用户名。。。。")
    }
    //查询数据库是否有这个用户名
    $.ajax({
        type:"get",
        url:ctx + "/checkusername",
        async:false,
        dataType:"json",
        data:{"username":username},
        success:function(rs){
             alert($("#ck_name").val());
        },
        error:function () {
            alert("发生未知错误。。。。")
        }
    });
}

