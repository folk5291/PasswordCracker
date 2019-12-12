# PasswordCracker

This project uses a basic dictionary in order to try and find the user's password. The user's password is currently just a hardcoded string within the code. Eventually I would like to change this so that it will attempt to break a user's password by entering it within a login screen. 

I am using a text file which the program iterates through and appends different items to each common password until it finds one that matches either one of the common passwords or a variation of the common password with different items appended to it.

Currently there are several methods that are still being worked on. These methods will do several things such as, replacing common characters, hashing the original password, and hashing the attempted password before comparing it to the original password.
