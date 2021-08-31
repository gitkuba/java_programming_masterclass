package com.gitkuba;

public class Printer {
  private int tonerLevel;
  private int pagesPrinted = 0;
  private boolean duplex;

  public Printer(int tonerLevel, boolean duplex) {
    this.tonerLevel = tonerLevel;
    this.duplex = duplex;
  }

  public int addToner(int tonerAmount) {
    if (this.tonerLevel < 1 || this.tonerLevel > 100) {
      return -1;
    }

    int newTonerLevel = this.tonerLevel + tonerAmount;
    if (newTonerLevel > 100) {
      return -1;
    }

    this.tonerLevel = newTonerLevel;
    return this.tonerLevel;
  }

  public int getPagesPrinted() {
    return pagesPrinted;
  }

  public int printPages(int pages) {
    int pagesToPrint = pages;

    if (this.duplex) {
      pagesToPrint = (int) Math.ceil((float) pagesToPrint / 2);
    }

    this.pagesPrinted += pagesToPrint;
    return pagesToPrint;
  }
}
