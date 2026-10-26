public class Personaggio{

	private float Danno;
	private float Vita;
	private float Velocità;



float ControlloInput (float input){
	if(input<101 && input>0){

	return input;
}else{
throw new IllegalArgumentException();
}

}

Personaggio(float Danno, float Velocità, float Vita){
	
	this.Danno=ControlloInput(Danno);
	this.Velocità=ControlloInput(Velocità);
	this.Vita=ControlloInput(Vita);
	
}

float Attacco (float Vita, float Danno){
	if (Vita >0 && Danno >0){

	Vita -= Danno;

return Vita
 
}




}


}









}