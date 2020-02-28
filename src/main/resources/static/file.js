
function postRequest_FileUpload(){
    var fileInput = document.getElementById('file_upload');
    var file = fileInput.files[0];
    var formData = new FormData();
    let url = document.getElementById('file_upload').value ;
    $.ajax({
        url : "/files",
        type: "POST",
        enctype: 'multipart/form-data',
        processData: false,
        contentType: false,
        cache: false,
        data : fileInput,
        timeout : 999999,
        success : function(formData){
            formData.append('file', file);
        }
        ,
        error : function(e) {
            console.log("error: ", e);
            display(e);
        },
        done : function(e) {
            console.log("done");
        }
    });
}
function jsonParser_FileDownload(){
    let url = document.getElementById('file_download').value ;
    $.ajax({
        url : url,
        type : "GET",
        timeout : 999999,
        success : function() {
            document.location = url;
        },
        error : function(e) {
            console.log("error: ", e);
            display(e);
        },
        done : function(e) {
            console.log("done");
        }
    });
}

function jsonParser_FileDelete(){
    var url = document.getElementById('file_delete').value ;
    $.ajax({
        url : url,
        type : "delete",
        timeout : 999999,
        success : function() {

        },
        error : function(e) {
            console.log("error: ", e);
            display(e);
        },
        done : function(e) {
            console.log("done");
        }
    });
}
