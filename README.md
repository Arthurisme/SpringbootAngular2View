# SpringbootAngular2View

Updated to Angular 2 rc5, using universal ngModule.

##Why this?
Usually Angular 2 app is designed as an independent front end website(or Mobile app) which communicated with back end via RESTful or other service. The angular router provide the navigation service between different view.
This is a good design method. But for some full stack framework, they need angular 2,  and don’t need Angular 2 router, for example:  
A spring website which have already have finish most of its pages in traditional  way and want to use Angular 2 components as views for remain pages.
I just have such a case, so I do a demo for Angular 2 view in spring boot.



#This is not front end, this is the views in Spring framework.
The router function are not supported, because here angular 2 component is using as view in spring.


##How to use:
Download and import with IntelliJ IDEA or Eclipse, and make view under templates folder. And make REST service as controller.
and using REST service in Angular 2 app folder (static/ name of angular app).


##For production:
Currently All the libs are on cdn, not on local. For production please change cdn url to local url, and compile all ts to js in same folder.

##next steps:
1,Angular 2 cli will be use in this project in next step.
2,I will make a automatically compile ts to js when I finish my currently  commercial project.
