package uk.co.boombastech.authentication.services;

import uk.co.boombastech.authentication.models.LoginDetails;
import uk.co.boombastech.authentication.models.RegistrationDetails;
import uk.co.boombastech.authentication.models.UpdatedUserDetails;
import uk.co.boombastech.authentication.models.User;

public class AuthenticationServiceImpl implements AuthenticationService {
	@Override
	public User registerNewUser(RegistrationDetails registrationDetails) {
		return null;
	}

	@Override
	public User loginUser(LoginDetails loginDetails) {
		return null;
	}

	@Override
	public boolean updateUserDetails(UpdatedUserDetails updatedUserDetails) {
		return false;
	}

	@Override
	public boolean logoutUser(User user) {
		return false;
	}
}