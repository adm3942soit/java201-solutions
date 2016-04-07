===SPRING MVC====
====================================================================

*Activity_01*
============================================================================
The Spring web MVC framework provides 
                     **model-view-controller** 
architecture and ready components that can be used to running web applications.

**The Model**encapsulates the application data 
and in general they will consist of POJO.

**The View** is responsible for rendering the model data 
and in general it generates HTML output that the client's browser 
can interpret.

**The Controller** is responsible for processing user requests 
and building model and passes it to the view for rendering.

Main role playing DispatcherServlet(describes in web.xml):

![Role DispatcherServlet](http://www.tutorialspoint.com/spring/images/spring_dispatcherservlet.png)

>After receiving an HTTP request, DispatcherServlet consults the HandlerMapping to call the appropriate Controller.

>The Controller takes the request and calls the appropriate service methods based on used GET or POST method. The service method will set model data based on defined business logic and returns view name to the DispatcherServlet.

>The DispatcherServlet will take help from ViewResolver to pickup the defined view for the request.

>Once view is finalized, The DispatcherServlet passes the model data to the view which is finally rendered on the browser.

Practical example implementation Spring MVC for simple web application is project activity_01.
 
>Structure project:
![StructureProject](/ProjectStructure.png)

In this example there is usage main annotations for Spring MVC:

>The **@Controller** annotation defines the class as a Spring MVC controller

>The **@RequestMapping(value = "/hello", method = RequestMethod.GET)** is used 
to declare method as the controller's default service method to handle HTTP GET request. 
The *value* attribute indicates the URL to which the handler method is mapped 
and the *method* attribute defines the service method to handle HTTP GET request. 


Usage JSP-pages describes in dispatcher-servlet.xml 

First page of application:

![index.jsp](/index.png)

Second page of application:

![welcom.jsp](/Welcome.png)

**Requirements to Spring MVC training:**

>add needed annotation into AppController class 
to get working web-application




 
 
 