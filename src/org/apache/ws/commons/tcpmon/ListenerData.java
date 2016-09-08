package org.apache.ws.commons.tcpmon;

public class ListenerData {
  private String name;
  private int listenPort;
  private String targetHost;
  private int targetPort;

  public ListenerData() {
    // For jackson
  }

  public ListenerData(String name, int listenPort, String targetHost, int targetPort) {
    super();
    this.name = name;
    this.listenPort = listenPort;
    this.targetHost = targetHost;
    this.targetPort = targetPort;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getListenPort() {
    return listenPort;
  }

  public void setListenPort(int listenPort) {
    this.listenPort = listenPort;
  }

  public String getTargetHost() {
    return targetHost;
  }

  public void setTargetHost(String targetHost) {
    this.targetHost = targetHost;
  }

  public int getTargetPort() {
    return targetPort;
  }

  public void setTargetPort(int targetPort) {
    this.targetPort = targetPort;
  }

}
