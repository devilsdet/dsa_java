LifCycles:
=======================

Maven is based around the central concept of a build lifecycle. What this means is that 
the process for building and distributing a particular artifact (project) is clearly defined.

There are three built-in build lifecycles: default, clean and site.
The default lifecycle handles your project deployment,
The clean lifecycle handles project cleaning,
The site lifecycle handles the creation of your project's web site.

A Build Lifecycle is Made Up of Phases
Each of these build lifecycles is defined by a different list of build phases

the default lifecycle comprises of the following phases

validate - validate the project is correct and all necessary information is available
compile - compile the source code of the project
test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
package - take the compiled code and package it in its distributable format, such as a JAR.
verify - run any checks on results of integration tests to ensure quality criteria are met
install - install the package into the local repository, for use as a dependency in other projects locally
deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.


