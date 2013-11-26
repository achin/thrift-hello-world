# Thrift Hello World

A simple Thrift client and server in Clojure.

## Usage

There are two ways of running the client and server -- with Leiningen or with Java.

### Leiningen
Launch the server.

```
$ lein run -m thrift-hello-world.server 7007
```

Run the client.

```
$ lein run -m thrift-hello-world.client localhost 7007 hello
-> hello
```

### Java
Build an uberjar.

```
$ lein uberjar
```

Launch the server.

```
$ java -cp target/thrift-hello-world-0.1.0-SNAPSHOT-standalone.jar clojure.main -m thrift-hello-world.server localhost 7000
```

Run the client.

```
$ ava -cp target/thrift-hello-world-0.1.0-SNAPSHOT-standalone.jar clojure.main -m thrift-hello-world.client localhost 7000 hello
-> hello
```

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
