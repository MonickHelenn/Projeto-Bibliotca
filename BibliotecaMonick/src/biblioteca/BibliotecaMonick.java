/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
/**
 * @author 01370013 - MONICK HELENN
 */
public class BibliotecaMonick extends Application 
{
    
    @Override
    public void start(final Stage primeiroStage) {
        TextField tfNum1 = new TextField();
        TextField tfNum2 = new TextField ();
        Button btnAdicao = new Button ("soma");
        Button btnLimpar = new Button ("Limpar");
        Button btnNovaJanela = new Button ("Nova Janela");
        Label lblResposta = new Label ("?");
        
 
        //inicio LAYOUT ------------
        GridPane raiz = new GridPane ();
         raiz.setHgap(10);
         raiz.setVgap(10);
         raiz.add(btnAdicao, 0, 0);
         raiz.add(btnLimpar, 0, 4, 2, 1);
         raiz.add(tfNum1, 0, 2);
         raiz.add(tfNum2, 1, 2);
         raiz.add(lblResposta, 0, 3, 2, 1);
         raiz.add(btnNovaJanela, 0, 5);
         
         Scene cena = new Scene(raiz, 300, 250);
         primeiroStage.setTitle("Biblioteca: Livros");
         primeiroStage.setScene(cena); 
                btnNovaJanela.setOnAction(new EventHandler<ActionEvent>(){
        @Override
         public void handle (ActionEvent event){
         Label lblNova = new Label ("NOVA");
         StackPane lytNovo = new StackPane();
             Image imagem = new Image ("https://th.bing.com/th/id/OIP.uQ_sc_v7EcFTa4LUdNsNPAHaE6?pid=ImgDet&rs=1");
             ImageView imageView = new ImageView();
             imageView.setImage(imagem);
             imageView.setFitWidth(99);
             imageView.setPickOnBounds(true);
             
         lytNovo.getChildren().add(lblNova);
         lytNovo.getChildren().add(imageView);
         Scene cenaNova = new Scene(lytNovo, 230, 100);
         //nova janela -----------
         Stage stgNovaJanela = new Stage();
         stgNovaJanela.setTitle("Segundo Palco");
         stgNovaJanela.setScene(cenaNova);

         //colca a posicao da segunda janela em relacao a primeira
         stgNovaJanela.setX(primeiroStage.getX() + 200);
         stgNovaJanela.setY(primeiroStage.getY() + 100);
         stgNovaJanela.show();
         }
        });
         
         primeiroStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
