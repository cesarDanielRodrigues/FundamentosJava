FROM mcr.microsoft.com/devcontainers/base:ubuntu

ARG USERNAME=vscode

RUN apt-get update && \
    apt-get install -y wget curl unzip && \
    wget https://download.oracle.com/java/20/latest/jdk-20_linux-x64_bin.deb && \
    apt install -y ./jdk-20_linux-x64_bin.deb && \
    rm jdk-20_linux-x64_bin.deb && \
    apt-get clean

ENV JAVA_HOME=/usr/lib/jvm/jdk-20
ENV PATH="${JAVA_HOME}/bin:${PATH}"
