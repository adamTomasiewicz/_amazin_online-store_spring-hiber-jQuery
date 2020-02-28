function jsonParser_CreateBook(){

    var json = '{"idProduct":"'+ document.getElementById('book_idProduct').value +'", ' +
        '"title":"'+ document.getElementById('book_title').value+'", ' +
        '"author":"'+ document.getElementById('book_author').value+'"}';

    $.ajax({
        url : "/product/book/create",
        type : "POST",
        contentType : "application/json",
        data : json,
        timeout : 999999,
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

function jsonParser_UpdateBook(){
    var json = '{"idProduct":"'+ document.getElementById('book_idProduct').value +'", ' +
        '"title":"'+ document.getElementById('book_title').value+'", ' +
        '"author":"'+ document.getElementById('book_author').value+'"}';
    $.ajax({
        url : "/product/book/update",
        type : "PUT",
        contentType : "application/json",
        data : json,
        timeout : 999999,
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

function jsonParser_DeleteBook(){
    var json = '{"idProduct":"'+ document.getElementById('book_idProduct').value +'", ' +
        '"title":"'+ document.getElementById('book_title').value+'", ' +
        '"author":"'+ document.getElementById('book_author').value+'"}';
    $.ajax({
        url : "/product/book/delete",
        type : "DELETE",
        contentType : "application/json",
        data : json,
        timeout : 999999,
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

function jsonParser_CreateBoardGame(){
    var json = '{"idProduct":"'+ document.getElementById('boardGame_idProduct').value +'", ' +
        '"title":"'+ document.getElementById('boardGame_title').value+'", ' +
        '"author":"'+ document.getElementById('boardGame_author').value+'"}';
    $.ajax({
        url : "/product/boardgame/create",
        type : "POST",
        contentType : "application/json",
        data : json,
        timeout : 999999,
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

function jsonParser_UpdateBoardGame(){
    var json = '{"idProduct":"'+ document.getElementById('boardGame_idProduct').value +'", ' +
        '"title":"'+ document.getElementById('boardGame_title').value+'", ' +
        '"author":"'+ document.getElementById('boardGame_author').value+'"}';
    $.ajax({
        url : "/product/boardgame/update",
        type : "PUT",
        contentType : "application/json",
        data : json,
        timeout : 999999,
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

function jsonParser_DeleteBoardGame(){
    var json = '{"idProduct":"'+ document.getElementById('boardgame_idProduct').value +'", ' +
        '"title":"'+ document.getElementById('boardgame_title').value+'", ' +
        '"author":"'+ document.getElementById('boardgame_author').value+'"}';
    $.ajax({
        url : "/product/boardgame/delete",
        type : "DELETE",
        contentType : "application/json",
        data : json,
        timeout : 999999,
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

function jsonParser_CreateVideoGame(){
    var json = '{"idProduct":"'+ document.getElementById('videoGame_idProduct').value +'", ' +
        '"title":"'+ document.getElementById('videoGame_title').value+'", ' +
        '"author":"'+ document.getElementById('videoGame_author').value+'"}';

    $.ajax({
        url : "/product/videogame/create",
        type : "POST",
        contentType : "application/json",
        data : json,
        timeout : 999999,
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

function jsonParser_UpdateVideoGame(){
    var json = '{"idProduct":"'+ document.getElementById('videoGame_idProduct').value +'", ' +
        '"title":"'+ document.getElementById('videoGame_title').value+'", ' +
        '"author":"'+ document.getElementById('videoGame_author').value+'"}';
    $.ajax({
        url : "/product/videogame/update",
        type : "PUT",
        contentType : "application/json",
        data : json,
        timeout : 999999,
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

function jsonParser_DeleteVideoGame(){
    var json = '{"idProduct":"'+ document.getElementById('videoGame_idProduct').value +'", ' +
        '"title":"'+ document.getElementById('videoGame_title').value+'", ' +
        '"author":"'+ document.getElementById('videoGame_author').value+'"}';
    $.ajax({
        url : "/product/videogame/delete",
        type : "DELETE",
        contentType : "application/json",
        data : json,
        timeout : 999999,
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
