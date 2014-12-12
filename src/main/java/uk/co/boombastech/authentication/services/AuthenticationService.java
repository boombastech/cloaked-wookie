package uk.co.boombastech.authentication.services;

import uk.co.boombastech.authentication.models.LoginDetails;
import uk.co.boombastech.authentication.models.RegistrationDetails;
import uk.co.boombastech.authentication.models.UpdatedUserDetails;
import uk.co.boombastech.authentication.models.User;

public interface AuthenticationService {
	User registerNewUser(RegistrationDetails registrationDetails);
	User loginUser(LoginDetails loginDetails);
	boolean updateUserDetails(UpdatedUserDetails updatedUserDetails);
	boolean logoutUser(User user);
}