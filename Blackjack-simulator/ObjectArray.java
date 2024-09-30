public class ObjectArray{
	int x;
	int y;
	ObjectArray one = new ObjectArray(2,3);
	ObjectArray two = new ObjectArray(5,6);
	ObjectArray three = new ObjectArray(5,5);
	ObjectArray requirementArray[]= new ObjectArray[]{one, two, three};
	public ObjectArray(int x, int y){
		this.x=x;
		this.y=y;
	}
	public ObjectArray greg(ObjectArray randomName){
		randomName.x=2;
		return randomName;
	}
}