package uk.co.boombastech.imperialassault.controllers;

import ninja.Result;
import ninja.Results;
import uk.co.boombastech.controllers.BoombastechController;

public class ImperialAssaultLandingPage implements BoombastechController {

	public Result execute() {
		return Results.text().render("hello");
	}
}