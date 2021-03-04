package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class SampleController implements Initializable{
		
	@FXML
	private TextField lblTemperature2;
	
	@FXML
    private TextField lblTemperature1;
	
	@FXML
	private TextField lblPoids1;

	@FXML
	private TextField lblPoids2;

	@FXML
	private TextField lblLongueur1;

	@FXML
	private TextField lblLongueur2;
	
	@FXML
    private TextField lblEnergie1;
	
	@FXML
	private TextField lblEnergie2;

    @FXML
    private TextField lblVolume2;

    @FXML
    private TextField lblVolume1;

    @FXML
    private ComboBox<String> cboEnergie1;

    @FXML
    private ComboBox<String> cboEnergie2;

    @FXML
    private ComboBox<String> cboLongueur2;

    @FXML
    private ComboBox<String> cboLongueur1;

    @FXML
    private ComboBox<String> cboTemperature1;

    @FXML
    private ComboBox<String> cboTemperature2;

    @FXML
    private ComboBox<String> cboPoids1;

    @FXML
    private ComboBox<String> cboPoids2;
    
    @FXML
    private ComboBox<String> cboVolume1;

    @FXML
    private ComboBox<String> cboVolume2;

    @FXML
    private Button btn;
    
    @FXML
    private void fermer ()
    {
    		System.exit(0);
    }
    
    
    //longueur
    private ObservableList<String> listeLongueur = (ObservableList<String>)FXCollections.observableArrayList ("kilomètre", "mètre", "centimètre", "milimètre", "pouces");
    double [] longueur = {0.01, 1.0, 100.0, 1000.0, 39.37};
    
    //volume
    private ObservableList<String> listeVolume = (ObservableList<String>)FXCollections.observableArrayList ("litre", "mililitre", "once", "cuillère à soupe", "cuillère à thé");
    double [] volume = {0.001, 1.0, 0.035, 0.067, 0.2};
    
    //température
    private ObservableList<String> listeTempérature = (ObservableList<String>)FXCollections.observableArrayList ("celsius", "fahrenheit", "kelvin");
    double [] temperature = {1.0, 33.8, 274.15};
    
    //energie
    private ObservableList<String> listeEnergie = (ObservableList<String>)FXCollections.observableArrayList ("joule", "kilojoule", "watt", "gramme calorie", "volt");
    double [] energie = {1.0, 0.001, 0.00027, 0.23, 6.24};
    
    //poids
    private ObservableList<String> listePoids = (ObservableList<String>)FXCollections.observableArrayList ("kilogramme", "gramme", "tonne", "livre", "pierres");
    double [] poids = {0.001, 1.0, 1.1, 0.002, 0.0001};
    
	@Override
	public void initialize(URL location, ResourceBundle resources)
		{
			cboLongueur1.setItems(listeLongueur);
			cboLongueur2.setItems(listeLongueur);
			cboLongueur1.getSelectionModel().selectFirst();
			cboLongueur2.getSelectionModel().selectFirst();
			
			cboVolume1.setItems(listeVolume);
			cboVolume2.setItems(listeVolume);
			cboVolume1.getSelectionModel().selectFirst();
			cboVolume2.getSelectionModel().selectFirst();
			
			cboTemperature1.setItems(listeTempérature);
			cboTemperature2.setItems(listeTempérature);
			cboTemperature1.getSelectionModel().selectFirst();
			cboTemperature2.getSelectionModel().selectFirst();
			
			cboEnergie1.setItems(listeEnergie);
			cboEnergie2.setItems(listeEnergie);
			cboEnergie1.getSelectionModel().selectFirst();
			cboEnergie2.getSelectionModel().selectFirst();
			
			cboPoids1.setItems(listePoids);
			cboPoids2.setItems(listePoids);
			cboPoids1.getSelectionModel().selectFirst();
			cboPoids2.getSelectionModel().selectFirst();
		}
	
	//longueur
	@FXML
	void calculerLongueur1 ()
	{
			convertir (lblLongueur1, lblLongueur2, cboLongueur1, cboLongueur2, longueur);
	}
	
	@FXML
	void calculerLongueur2 ()
	{
			convertir (lblLongueur2, lblLongueur1, cboLongueur2, cboLongueur1, longueur);
	}
	
	//volume
	@FXML
	void calculerVolume1 ()
	{
			convertir (lblVolume1, lblVolume2, cboVolume1, cboVolume2, volume);
	}
	
	@FXML
	void calculerVolume2 ()
	{
			convertir (lblVolume2, lblVolume1, cboVolume2, cboVolume1, volume);
	}
	
	@FXML
	void calculerTemperature1 ()
	{
			convertir (lblTemperature1, lblTemperature2, cboTemperature1, cboTemperature2, temperature);
	}
	
	@FXML
	void calculerTemperature2 ()
	{
			convertir (lblTemperature2, lblTemperature1, cboTemperature2, cboTemperature1, temperature);
	}
	
	@FXML
	void calculerEnergie1 ()
	{
			convertir (lblEnergie1, lblEnergie2, cboEnergie1, cboEnergie2, energie);
	}
	
	@FXML
	void calculerEnergie2 ()
	{
			convertir (lblEnergie2, lblEnergie1, cboEnergie2, cboEnergie1, energie);
	}
	
	@FXML
	void calculerPoids1 ()
	{
			convertir (lblPoids1, lblPoids2, cboPoids1, cboPoids2, poids);
	}

	@FXML
	void calculerPoids2 ()
	{
			convertir (lblPoids2, lblPoids1, cboPoids2, cboPoids1, poids);
	}
	
	public void convertir(TextField txtA, TextField txtB, ComboBox boxA, ComboBox boxB, double [] tab)
	{
			int item1 = boxA.getSelectionModel().getSelectedIndex();
			int item2 = boxB.getSelectionModel().getSelectedIndex();
			try
				{
			double taux = tab [item2] / tab [item1];
			double res = taux * (Double.parseDouble(txtA.getText()));
			//txtLongueurB.setText(String.format("%.2 res"));	
			txtB.setText(Double.toString(res)); 
				}
			catch (NumberFormatException e)
				{
				Alert alert = new Alert(AlertType.ERROR);
				alert.setHeaderText("attention - erreur");
				alert.setTitle("erreur");
				alert.setContentText("caractères autres que des nombres ne sont pas acceptées");
				alert.show();
				txtA.requestFocus();
				}
	}

}
