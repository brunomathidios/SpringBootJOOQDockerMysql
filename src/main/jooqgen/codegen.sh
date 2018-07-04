#!/bin/bash

java -classpath jooq-3.11.2.jar:jooq-meta-3.11.2.jar:jooq-codegen-3.11.2.jar:mysql-connector-java-8.0.11.jar:. org.jooq.codegen.GenerationTool jooq_gen.xml
