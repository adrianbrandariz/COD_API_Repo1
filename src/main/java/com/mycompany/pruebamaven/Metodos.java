package com.mycompany.pruebamaven;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

/**
 *
 * @author abrandarizdominguez
 */
public class Metodos {

    public void crearRepositorio() {
        try {
            String login = JOptionPane.showInputDialog("GitHub User:");
            String password = JOptionPane.showInputDialog("GitHub Password:");
            GitHub github = GitHub.connectUsingPassword(login, password);
            String repositoryName = JOptionPane.showInputDialog("Repository Name:");
            String description = JOptionPane.showInputDialog("GitHub description:");
            GHRepository newRepository = github.createRepository(
                    repositoryName, 
                    description, 
                    "http://www.github.com/adrianbrandariz/api", true);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
