## Differences between proxy and dynamic proxy patterns

### Answer 1:
Dynamic proxy is essentially the proxy design pattern, in which the proxy object is created dynamically during runtime.

Proxy design pattern uses a proxy, which acts as a mediator between client and underlying real object. Programmer can perform access control, validation and additional action in proxy before delegating the request to real object.

Now suppose you want to perform some generic action before calling any method of any class for example you want to keep log of all the method calls made by client. In that case, if you want to implement proxy design pattern, steps are as following:

Create proxy class for each class.
implement proxy class in a way, that first it make a log entry of the method call made by the client, than delegate the call to real object.
the problem with above technique is that, suppose you have 1000 classes, you'll need to write 1000 proxy classes for each class and implements all the method in all the classes which essentially doing the same thing(performing logging action in our case), which is very tedious process and wastage of memory.

Won't it be better, if somehow at runtime, we are able to create a proxy object based on the client's call and then perform generic action(logging action in our case) before delegating the call to the real object, well that what dyanmic proxies does.

The process in case of dynamic proxy is as following:

client call some action on an object.
system create a proxy object at runtime based on client's call.
proxy object calls a generic method to perform a generic action in case of each call.
after the action, proxy object delegate the call to real object.
so in a nutshell, if you have some generic action to perform, use dynamic proxy, but if you want each class to be treated differenlty (in some class perform logging, in some don't, in some access contorl etc.) use simple proxy. Hope I helped. If you need a code example, please let me know.

### Answer 2:



## Differences between Proxy and Decorator Pattern

Here is the direct quote from the GoF (page 216).

Although decorators can have similar implementations as proxies, decorators have a different purpose. A decorator adds one or more responsibilities to an object, whereas a proxy controls access to an object.

Proxies vary in the degree to which they are implemented like a decorator. A protection proxy might be implemented exactly like a decorator. On the other hand, a remote proxy will not contain a direct reference to its real subject but only an indirect reference, such as "host ID and local address on host." A virtual proxy will start off with an indirect reference such as a file name but will eventually obtain and use a direct reference.

Popular answers indicate that a Proxy knows the concrete type of its delegate. From this quote we can see that is not always true.

The difference between Proxy and Decorator according to the GoF is that Proxy restricts the client. Decorator does not. Proxy may restrict what a client does by controlling access to functionality; or it may restrict what a client knows by performing actions that are invisible and unknown to the client. Decorator does the opposite: it enhances what its delegate does in a way that is visible to clients.

We might say that Proxy is a black box while Decorator is a white box.

The composition relationship between wrapper and delegate is the wrong relationship to focus on when contrasting Proxy with Decorator, because composition is the feature these two patterns have in common. The relationship between wrapper and client is what differentiates these two patterns.

Decorator informs and empowers its client.
Proxy restricts and disempowers its client.