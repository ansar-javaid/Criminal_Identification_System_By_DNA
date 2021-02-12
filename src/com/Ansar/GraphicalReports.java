package com.Ansar;

import java.io.IOException;

public class GraphicalReports {
    public void Lahore() throws IOException {
        String fileName = "C:\\Users\\Ansar\\IdeaProjects\\Criminal Identification System\\runLhr.bat";
        String[] commands = {"cmd", "/c", "start", "\"DummyTitle\"",fileName};
        Runtime.getRuntime().exec(commands);
    }
    public void Karachi() throws IOException {
        String fileName = "C:\\Users\\Ansar\\IdeaProjects\\Criminal Identification System\\runkr.bat";
        String[] commands = {"cmd", "/c", "start", "\"DummyTitle\"",fileName};
        Runtime.getRuntime().exec(commands);
    }
    public void Abbottabad() throws IOException {
        String fileName = "C:\\Users\\Ansar\\IdeaProjects\\Criminal Identification System\\runAbt.bat";
        String[] commands = {"cmd", "/c", "start", "\"DummyTitle\"",fileName};
        Runtime.getRuntime().exec(commands);
    }
    public void Multan() throws IOException {
        String fileName = "C:\\Users\\Ansar\\IdeaProjects\\Criminal Identification System\\runMul.bat";
        String[] commands = {"cmd", "/c", "start", "\"DummyTitle\"",fileName};
        Runtime.getRuntime().exec(commands);
    }
    public void Islamabad() throws IOException {
        String fileName = "C:\\Users\\Ansar\\IdeaProjects\\Criminal Identification System\\runIsl.bat";
        String[] commands = {"cmd", "/c", "start", "\"DummyTitle\"",fileName};
        Runtime.getRuntime().exec(commands);
    }
    public void Total() throws IOException {
        String fileName = "C:\\Users\\Ansar\\IdeaProjects\\Criminal Identification System\\runTot.bat";
        String[] commands = {"cmd", "/c", "start", "\"DummyTitle\"",fileName};
        Runtime.getRuntime().exec(commands);
    }
}
