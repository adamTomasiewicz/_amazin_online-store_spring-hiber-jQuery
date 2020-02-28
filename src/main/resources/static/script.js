/*
const $btn = $();
const $updateProduct = $('b');
const $deleteProduct = $btn.find('c');
$(document).ready(function() {
    $btn.on('click', function() {
        $users.html('');
        $btn.attr('disabled', true);
        $spinner.show();

        $.ajax('https://jsonplaceholder.typicode.com/users')
            .done(function (users) {
                users.forEach(function(user) {
                    $users.append(`
                        <tr>
                            <td>${user.name}<td>
                            <td>${user.username}<td>
                            <td>${user.email}<td>
                        </tr>
                    `);
                });
            })
            .fail(function() {
                alert('Spróbuj ponownie')
            })
            .always(function() {
                $btn.attr('disabled', false);
                $spinner.hide();
            });
    })
}*/
