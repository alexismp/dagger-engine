dagger-engine
=============

Simple sample of dagger injection running in AppEngine
This is a server-side (servlet) adaptation of the coffee sample available from :
https://github.com/square/dagger/tree/master/examples/simple/src/main/java/coffee

The key is to construct the Dagger object graph in a Servlet Context Listener,
save it as a context attribute and retrieve it in the servlet init method to
start the Dagger-enabled application.
