default: test
.PHONY: default

install_prerequisites:
	mvn test-compile
.PHONY: install_prerequisites

generate_tests:
	hiptest-publisher -c java-testng.conf -t "$(SECRET_TOKEN)" --without=actionwords
.PHONY: generate_tests

test: install_prerequisites
	mvn test
.PHONY: test
