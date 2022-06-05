function a() {
	var username = $('#username').val()
	var a = /^[\u4e00-\u9fa5]{1,6}$/
	var flag = a.test(username)
	if (flag) {
		$('#username').val(username)
		$('#username').after("<span id='username-a'>✔</span>")
		$('#a-username').remove()
	} else {
		$('#username').val('')
		$('#username-a').remove()
		$('#username').after("<span id='a-username'>✖</span>")
	}

}

function b() {
	var tall = $('#tall').val()
	var b = /^[1-9][0-9]{10}$/
	var flag = b.test(tall)
	if (flag) {
		$('#tall').val(tall)
		$('#tall').after("<span id='tall-b'>✔</span>")
		$('#b-tall').remove()
	} else {
		$('#tall').val('')
		$('#tall-b').remove()
		$('#tall').after("<span id='b-tall'>✖</span>")
	}
}

function c() {
	var password = $('#password ').val()
	var b = /^[a-zA-Z]\w{5,17}$/
	var flag = b.test(password)
	if (flag) {
		$('#password').val(password)
		$('#password').after("<span id='password-c'>✔</span>")
		$('#c-password').remove()
	} else {
		$('#password').val('')
		$('#password-c').remove()
		$('#password').after("<span id='c-password'>✖</span>")
	}
}

function d() {
	var password = $('#password ').val()
	var pas2 = $('#password2').val()
	if (password == pas2 && pas2 != '') {
		$('#password2').val(password)
		$('#password2').after("<span id='password2-d'>✔</span>")
		$('#d-password2').remove()
	} else {
		$('#password2').val('')
		$('#password2-d').remove()
		$('#password2').after("<span id='d-password2'>✖</span>")
	}
}

function e() {
	var email = $('#Email').val()
	var b = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/
	var flag = b.test(email)
	if (flag) {
		$('#Email').after("<span id='Email-e'>✔</span>")
		$('#Email').val(email)
		$('#e-Email').remove()
		}
		else {
			$('#Email').val('')
			$('#Email-e').remove()
			$('#Email').after("<span id='e-Email'>✖</span>")
		}
	}
