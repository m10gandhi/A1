import java.util.ArrayList;
import java.util.List;

public class AstroidSubject implements AstroSubject {

	List<BoardComponent> observers = null;

	public AstroidSubject() {
		observers = new ArrayList<BoardComponent>();
	}

	@Override
	public void Attach(BoardComponent observer) {
		observers.add(observer);
	}

	@Override
	public void Detch(BoardComponent observer) {
		observers.remove(observer);

	}

	@Override
	public void Notify(BoardComponent observer) {
		int i=0;
		while(i<observers.size()) {
			observers.get(i).update(observer);
			i++;
			
		}
	}

}
