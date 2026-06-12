FROM mcr.microsoft.com/devcontainers/base:ubuntu

ARG USERNAME=vscode


RUN apt-get update
RUN apt-get install -y wget curl unzip
RUN wget https://download.oracle.com/java/20/archive/jdk-20.0.2_linux-x64_bin.deb
RUN apt install -y ./jdk-20.0.2_linux-x64_bin.deb
RUN rm jdk-20.0.2_linux-x64_bin.deb
RUN apt-get clean


ENV JAVA_HOME=/usr/lib/jvm/jdk-20
ENV PATH="${JAVA_HOME}/bin:${PATH}"
