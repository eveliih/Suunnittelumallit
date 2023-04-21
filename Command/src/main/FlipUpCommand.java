package main;

public class FlipUpCommand implements Command {
	private Valkokangas kangas;

	public FlipUpCommand(Valkokangas kangas) {
		this.kangas = kangas;
	}

	@Override // Command
	public void execute() {
		kangas.down();
	}
}
