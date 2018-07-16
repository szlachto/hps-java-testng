# hps-java-testng
[![Build Status](https://travis-ci.org/hiptest/hps-java-testng.svg?branch=master)](https://travis-ci.org/hiptest/hps-java-testng)

Hiptest publisher samples with Java/TestNG

In this repository you'll find tests generated in Java/TestNG format from [Hiptest](https://hiptest.com), using [Hiptest publisher](https://github.com/hiptest/hiptest-publisher).

The goals are:

 * to show how tests are exported in Java/TestNG.
 * to check exports work out of the box (well, with implemented actionwords)

System under test
------------------

The SUT is a (not that much) simple coffee machine. You start it, you ask for a coffee and you get it, sometimes. But most of times you have to add water or beans, empty the grounds. You have an automatic expresso machine at work or at home? So you know how it goes :-)

Update tests
-------------


To update the tests:

    hiptest-publisher -c java-testng.conf --only=tests

The tests are generated in [``src/test/java/com/testng/coffeemachine/ProjectTest.java``](https://github.com/hiptest/hps-java-testng/blob/master/src/test/java/com/testng/coffeemachine/ProjectTest.java)

Run tests
---------


To build the project and run the tests, use the following command:

    mvn package

The SUT implementation can be seen in [``src/main/java/com/testng/coffeemachine/CoffeeMachine.java``](https://github.com/hiptest/hps-java-testng/blob/master/src/main/java/com/testng/coffeemachine/CoffeeMachine.java)

The test report is generated in ```target/surefire-reports/TEST-com.testng.coffeemachine.ProjectTest.xml```