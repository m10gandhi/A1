
public interface AstroSubject {

	public void Attach(BoardComponent observer);
	public void Detch(BoardComponent observer);
	public void Notify(BoardComponent observer);
}
