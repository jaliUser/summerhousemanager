class BootStrap {

     def init = { servletContext ->
		new Bruger(navn:"Thomas",email:"thomas@msc-cse.com",telefon:"24237434").save()
		new Bruger(navn:"Hannah",email:"hannah_clementschmidt@hotmail.com",telefon:"20763873").save()
     }
     def destroy = {
     }
} 