# SPLAR
Software Product Lines Automated Reasoning 

### What is this ?

SPLAR is a java library for processing and configuring feature models. It was created by Marcilio Mendonca for the [SPLOT (SPL Online Tools) research project](http://www.splot-research.org).

### Usage

If you use Maven, you must install first the SPLAR library, and use the following dependency declaration:

```xml
<dependency>
	<groupId>ca.uwaterloo.gsd</groupId>
	<artifactId>splar</artifactId>
	<version>1.0.0</version>
</dependency>
```

If you are not using Maven, you must download the .jar library from the [releases page](https://github.com/ticsw/splar/releases/tag/1.0) in Github. In addition, you must download and include in your project the following libraries:

* [JavaBDD](http://javabdd.sourceforge.net/), version 2.10
* [Sat4j](http://www.sat4j.org/), version 2.0.4
* [jgrapht-core](http://jgrapht.org/), version 0.9.0
* [org.json](https://github.com/douglascrockford/JSON-java), version 20141113
* [opencsv](http://opencsv.sourceforge.net/), version 2.4

### Maven Installation

In order to use SPLAR in your Maven projects, you must build the project and install the libraries in your local maven repository. These tasks must be performed using the maven tools (in the command line or in your favorite IDE)

Using command line:
```
    $ mvn install
```

Using the [Eclipse m2e plugin](http://eclipse.org/m2e/):

1. Select the ``splar`` project in your workspace
2. Execute "Run As > Maven install"


### Differences with the original

* **Maven-based build**: In contrast to the original SPLAR library, this project is build using [Maven](http://maven.apache.org/). It includes a a pom.xml that tracks the project dependencies, allowing developers automatically include these dependencies in their project and manually detect conflicts with other libraries when they occur.
* **Tests are not included in the .jar**: The project includes source code for unit tests. Maven uses that code to test the library during compilation, but it does not include that classes in the final jar.


### Branches in Github

There are many branches in the SPLAR Git:

* ``original``, is the original source code for version 1.0
* ``maven-1.0``, is the maven-based source code for version 1.0