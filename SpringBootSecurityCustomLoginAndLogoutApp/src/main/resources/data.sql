  INSERT INTO `users3` (`username`, `password`, `full_name`, `role`, `country`, `enabled`) VALUES
	('amardeep', '$2a$10$s4/KKMQCCABA5zuPHHiE8.gOgOCRmdApto0jGFb0xwdGNbtJYm55C', 'Amardeep Kumar', 'ROLE_ADMIN', 'US', 1),
	('ruchi', '$2a$10$Po60SAad0LWFcU0y1MSWIOan4vs9AJ.wc5bHrF7oFRT7IXKCK2d9C', 'Ruchi Kumari', 'ROLE_USER', 'India', 1); 

   INSERT INTO `topics2` (`topic_id`, `title`, `category`) VALUES
	(1, 'Spring Rest Boot', 'Spring Boot'),
	(2, 'Spring Boot Security', 'Spring Boot'),
	(3, 'Spring MVC Framework', 'Spring Framework');