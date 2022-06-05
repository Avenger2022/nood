function a() {
	var username = $('#username').val()
	var a = /^[\u4e00-\u9fa5]{1,6}$/
	var flag = a.test(username)

	if (flag) {
		$('#username').val(username)
		$('.span:eq(0)').text('✔')
	} else {
		$('.span:eq(0)').text('✖')
	}
	if (username == '') {
		$('.span:eq(0)').text('*')
	}

}

function b() {
	var tall = $('#tall').val()
	var b = /^[1-9][0-9]{10}$/
	var flag = b.test(tall)
	if (flag) {
		$('#tall').val(tall)
		$('.span:eq(1)').text('✔')
	} else {
		$('.span:eq(1)').text('✖')
	}
	if (tall == '') {
		$('.span:eq(1)').text('*')
	}
}

function c() {
	var password = $('#password ').val()
	var b = /^[a-zA-Z]\w{5,17}$/
	var flag = b.test(password)
	if (flag) {
		$('#password').val(password)
		$('.span:eq(2)').text('✔')
	} else {
		$('.span:eq(2)').text('✖')
	}
	if (password == '') {
		$('.span:eq(2)').text('*')
	}
}

function d() {
	var password = $('#password ').val()
	var pas2 = $('#password2').val()
	if (password == pas2 && pas2 != '') {
		$('#password2').val(password)
		$('.span:eq(3)').text('✔')
	} else{
		$('.span:eq(3)').text('✖')
	}
	if (password2 == '') {
		$('.span:eq(3)').text('*')
	}
}

function e() {
	var email = $('#Email').val()
	var b = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/
	var flag = b.test(email)
	if (flag) {

		$('#Email').val(email)
		$('.span:eq(4)').text('✔')
	} else {
		$('.span:eq(4)').text('✖')
	}
	if (email == '') {
		$('.span:eq(4)').text('*')
	}
}
