document.getElementById('btnLogin').addEventListener(
    'click',
    function () {
        sendAsyncRequest(
            'POST',
            'http://localhost:8080/rest/login',
            function (resp) {
                localStorage.setItem('token', resp.responseData);
            },
            'application/json',
            { username: 'joydip', password: 'Joydip123' }
        )
    }
)