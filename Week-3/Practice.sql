use eventmanagement;

create table users(
	user_id int auto_increment PRIMARY KEY,
    full_name varchar(100) not null,
    email varchar(100) unique  not null,
    city varchar(100)  not null ,
    registration_date  date not null );
    
    
select * from users;

insert into users(full_name , email , city , registration_date)
values('Tarun Vijaay', 'tarun@gmail.com', 'Chennai', '2026-07-25'),
('Rahul Sharma', 'rahul@gmail.com', 'Bangalore', '2026-07-20'),
('Priya Singh', 'priya@gmail.com', 'Hyderabad', '2026-07-18'),
('Ankit Kumar', 'ankit@gmail.com', 'Mumbai', '2026-07-15'),
('Sneha Reddy', 'sneha@gmail.com', 'Pune', '2026-07-10');


CREATE TABLE events (
    event_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    description TEXT,
    city VARCHAR(100) NOT NULL,
    start_date DATETIME NOT NULL,
    end_date DATETIME NOT NULL,
    status ENUM('upcoming','completed','cancelled'),
    organizer_id INT,
    FOREIGN KEY (organizer_id) REFERENCES users(user_id)
);
    
select * from events;


INSERT INTO events
(title, description, city, start_date, end_date, status, organizer_id)
VALUES
('Java Workshop', 'Java basics training', 'Chennai', '2026-08-01 09:00:00', '2026-08-01 17:00:00', 'upcoming', 1),

('Tech Meetup', 'Networking event', 'Bangalore', '2026-07-20 10:00:00', '2026-07-20 13:00:00', 'completed', 2),

('Hackathon', '24-hour coding challenge', 'Hyderabad', '2026-09-10 08:00:00', '2026-09-11 08:00:00', 'upcoming', 3);


select * from event;


drop table event;

create table sessions(
	session_id int auto_increment primary key,
    event_id int, 
    title varchar(200) not null,
    speaker_name varchar(100) not null, 
    start_time datetime not null, 
    end_time datetime not null,
	FOREIGN KEY (event_id) REFERENCES events(event_id)
    );
    
    
    INSERT INTO sessions (event_id, title, speaker_name, start_time, end_time)
VALUES
(1, 'Java Basics', 'Tarun Vijaay', '2026-08-01 09:00:00', '2026-08-01 10:00:00'),

(2, 'Web Development', 'Rahul Sharma', '2026-08-02 10:00:00', '2026-08-02 11:30:00'),

(3, 'Database Design', 'Priya Singh', '2026-08-03 11:00:00', '2026-08-03 12:30:00'),

(1, 'Spring Boot', 'Ankit Kumar', '2026-08-01 02:00:00', '2026-08-01 03:30:00');

select *  from sessions;

create table registrations(
	registration_id int auto_increment primary key,
    user_id int ,
    event_id int ,
	registration_date date  not null,
    foreign key(user_id) references users(user_id),
    foreign key(event_id) references events(event_id) );
    
    
    
INSERT INTO registrations (user_id, event_id, registration_date)
VALUES
(1, 1, '2026-07-25'),
(2, 2, '2026-07-26'),
(3, 3, '2026-07-27'),
(4, 1, '2026-07-28'),
(5, 2, '2026-07-29');

create table feedback(
	feedback_id int auto_increment primary key,
    user_id int ,
    event_id int ,
    rating int check(rating between 1 and 5),
    comments text,
    feedback_date date not null,
    foreign key (user_id) references users(user_id),
    foreign key (event_id) references events(event_id) );
    
    
INSERT INTO feedback (user_id, event_id, rating, comments, feedback_date)
VALUES
(1, 1, 5, 'Excellent event with great speakers.', '2026-08-02'),

(2, 2, 4, 'Very informative and well organized.', '2026-07-21'),

(3, 3, 5, 'Amazing hackathon experience. Learned a lot!', '2026-09-12');


select * from feedback;

CREATE TABLE resources(
    resource_id INT AUTO_INCREMENT PRIMARY KEY,
    event_id INT,
    resource_type ENUM('pdf', 'image', 'link'),
    resource_url VARCHAR(225) NOT NULL,
    uploaded_at DATETIME NOT NULL,
    FOREIGN KEY (event_id) REFERENCES events(event_id)
);

INSERT INTO resources (event_id, resource_type, resource_url, uploaded_at)
VALUES
(1, 'pdf', 'https://example.com/java-workshop-notes.pdf', '2026-08-01 18:00:00'),

(2, 'image', 'https://example.com/tech-meetup-banner.jpg', '2026-07-20 09:30:00'),

(3, 'link', 'https://github.com/example/hackathon-resources', '2026-09-10 08:15:00');

select * from resources;

    