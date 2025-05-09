# My Learning Notes

HOW THINGS WORK WHEN WE CLICK ON RUN BUTTON?
1. Server Start
2. WAR File deploy hoti hai server mai.
3. Jar files load hoti hain: ClassLoader ke through load hoti hai.
4. Spring Container start hota hai.
5. DispatcherServlet Activate hota hai.
6. User Login form submit karta hai.
7. DispatcherServlet request ko controller ko bhejta hai.
8. Controller form data ko process karta hai.
9. JSP page ko prepare kiya jata hai.
10. Response ko browser par bhej dete hai.



WHAT IS WAR FILE?
WAR full form is Web Application Archieve.
Ye ek zip file hota hai jo tumhari complete web application ko pack karke rakhte hai.
HTML, CSS, JS files
JSP pages
Servlet classes (.class files)
WEB-INF folder (special configuration files)
web.xml file
JAR dependencies (agar hain)
WAR File ka kaam kya hai?
Jab tum apni web app ko server (jaise Tomcat) pe deploy karte ho, toh tumhara complete project ek WAR file me compress ho jaata hai.

Server WAR file ko extract karta hai aur fir use web application ke form me run karta hai.



SERVER STRUCTURE AND WORK?
Tomcat/
├── bin/              → Server start/stop scripts (.bat / .sh)
├── conf/             → Configuration files (like server.xml, web.xml)
├── lib/              → Server level JARs (like servlet-api.jar)
├── logs/             → Server logs (startup, errors, etc.)
├── temp/             → Temporary files
├── webapps/          → Your deployed apps (WAR folders/files)
│   ├── MyApp/        → Your app folder (deployed from WAR)
│   └── manager/      → Tomcat’s admin web app
├── work/             → Compiled JSP files & cache
└── ...
User Request → DispatcherServlet → Controller → Service Layer → View (JSP/Thymeleaf) → Browser Response

























1. Configure the DispatcherServlet in web.xml
   In traditional servlet-based programs, we extend HttpServlet and manually handle incoming requests, business logic, and view rendering — all in one place.
   Spring MVC simplifies this process using DispatcherServlet.

The DispatcherServlet is also a servlet (it internally extends HttpServlet) and works inside the Spring container.
Its role is to act as a Front Controller, which means:

When the Tomcat server starts, it loads the DispatcherServlet.

Whenever a request like /, /home, or /page comes in, it is handled by the DispatcherServlet.

2. Create the Spring Configuration File (spring-servlet.xml)
   This XML configuration file tells the Spring container:

Where to find controller classes (@Controller)

How to resolve views (e.g., which folder contains JSP files and what suffix they have)

It handles component scanning and view resolution.

3. Create Controller Classes
   Define your controllers using the @Controller annotation. These classes handle the incoming web requests and return the logical view names that should be displayed.

4. Create View Pages
   Create JSP files (or any other supported view technology) to display the final output to the user.
   These view pages are returned by controller methods and rendered by Spring's view resolver.







Convention over Configuration vs Configuration
Configuration: Manually system ko batana kya use karna hai, kaise karna hai, aur kahan se karna hai.
<beans>
<context:component-scan base-package="com.example.app" />
<mvc:annotation-driven />
</beans>
Yahaan tu Spring ko explicitly bol raha hai:
Kis package ko scan karna hai
MVC ko enable karna hai
Bean kis tarike se inject karne hain

Real Life Example:
Man le tere ghar me AC hai, lekin har baar AC chalu karne se pehle:

Remote dhundhna padta hai
Temperature set karna padta hai
Fan speed adjust karni padti hai
Ye sab manual setup = Configuration



Convention over Configuration
Agar tum kuch cheezein ek predefined tareeke se (yaani convention ke according) follow karo, to framework automatically samajh jaata hai kya karna hai — bina tumhare manually bataye.

✅ Example in Spring Boot:
Tu bas likhta hai:


@SpringBootApplication
public class MyApp {
public static void main(String[] args) {
SpringApplication.run(MyApp.class, args);
}
}
Aur Boot automatically:

Component scan kar leta hai
MVC setup kar leta hai
Embedded Tomcat chalu kar deta hai
JSON mapping configure kar deta hai

Kyun? Kyunki tu ne conventionally kaam kiya — standard folder structure, annotations jaise @RestController, @Service etc. use kiya.

🔍 Real Life Example:
Man le tere ghar ka AC smart hai:

Tu bas kamre me ghusta hai, AC khud chalu
Pehle se hi temperature aur speed set hai
Har cheez automatic ho rahi hai
Ye hai = Convention over Configuration



Why Spring moved to Convention?
Spring Boot ko banane ka reason hi ye tha:
"Developers ko baar baar configuration likhne ki zarurat na pade — unka focus business logic par ho."

Isliye:

Ye auto-configuration lata hai
Smart defaults use karta hai
Production-ready apps bana deta hai bina extra mehnat ke















SERVING STATIC FILES IN SPRING MVC
We need to explicitly configure resource handling in our spring-servlet.xml file.
<mvc:resources mapping="/resources/**" location="/resources/" />
<mvc:annotation-driven />


Also Update schema location
Ye line spring ko batati hai ki kuch special spring ke tags use karne wala ho jaise ki mvc: and tx:
http://www.springframework.org/schema/mvc
http://www.springframework.org/schema/tx/spring-mvc.xsd">


Why do we use static file what is the need of them 
1.Separation of concerns 
2.Performance Optimization
3.Reusability : Write once use many times.
4.Clean file Management




WHAT IS WEB-INF FOLDER?
WEB-INF ek special secured folder hota hai Java web applications ke liye,jo:
Server(Tomcat,etc.) ko allow karta hai ki woh use access kare.
Lekin browser (user) directly WEB-INF ke andar ki kisi file ko access nahi kar sakta
Reason:
1.Security : Browser cannot hit JSP directly.Must go through controller.
2.Logic: Controller pe aap logic,auth, data injection sab kar sakte ho.
3.MVC Pattern: Maintain Model-View-Controller architecture

Note: JSP file outside the WEB-INF are public so they can be easily accessed.
files which are in the root of webapp.

Static files are also accessible but WEB-INF are not because they are dynamic they cahnges according to the logic 
written in the controller.




