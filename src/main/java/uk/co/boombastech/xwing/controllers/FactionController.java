package uk.co.boombastech.xwing.controllers;

import ninja.Result;
import ninja.Results;
import uk.co.boombastech.xwing.models.Faction;
import uk.co.boombastech.xwing.services.FactionService;

import javax.inject.Inject;
import java.util.List;

public class FactionController {

	private final FactionService factionService;

	@Inject
	public FactionController(FactionService factionService) {
		this.factionService = factionService;
	}

	public Result execute() {
		List<Faction> factions = factionService.getFactions();
		return Results.json().render(factions);
	}
}