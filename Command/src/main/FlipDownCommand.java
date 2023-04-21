package main;

public class FlipDownCommand implements Command {
	private Valkokangas kangas;

	public FlipDownCommand(Valkokangas kangas) {
		this.kangas = kangas;
	}

	@Override // Command
	public void execute() {
		kangas.up();
		;
	}
}
