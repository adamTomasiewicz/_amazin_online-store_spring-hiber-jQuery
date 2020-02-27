function jsonParserBook(){
    var json = '{"idProduct":"'+ document.getElementById('book_idProduct').value +'", ' +
                '"title":"'+ document.getElementById('book_title').value+'", ' +
                '"author":"'+ document.getElementById('book_author').value+'"}';
    $.ajax({
        url : "/product/book/create",
        type : "POST",
        contentType : "application/json",
        data : json,
        timeout : 100000,
        success : function(json) {
            var json = JSON.parse(json);
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
function jsonParserBoardGame(){
    var data = '{"idProduct":"'+ document.getElementById('book_idProduct').value+'"}'; // here you create your json containing the var that you want to send to your server
    $.ajax({
        type : "POST",
        contentType : "application/json",
        url : "/product/book/5", // here you put the "Url" of your spring mvc controller
        data : data,
        timeout : 100000,
        success : function(data) {
            var json = JSON.parse(data); //here it's the callback in the success case
        },
        error : function(e) {
            console.log("ERROR: ", e);
        },
        done : function(e) {
        }
    });
}
function jsonParserVideoGame(){
    var data = '{"idProduct":"'+ document.getElementById('book_idProduct').value+'"}'; // here you create your json containing the var that you want to send to your server
    $.ajax({
        type : "POST",
        contentType : "application/json",
        url : "/product/book/5", // here you put the "Url" of your spring mvc controller
        data : data,
        timeout : 100000,
        success : function(data) {
            var json = JSON.parse(data); //here it's the callback in the success case
        },
        error : function(e) {
            console.log("ERROR: ", e);
        },
        done : function(e) {
        }
    });
}