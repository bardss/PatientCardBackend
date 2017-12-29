INSERT INTO "patientdto" (name, surname, patient_code, qr_code) VALUES ('Jakub', 'Aniola', '95071656524', 122075);
INSERT INTO "patientdto" (name, surname, patient_code, qr_code) VALUES ('Milan', 'Sawicki', '87073052828', 122076);
INSERT INTO "patientdto" (name, surname, patient_code, qr_code) VALUES ('Fabian', 'Grzes', '62040534871', 122077);
INSERT INTO "patientdto" (name, surname, patient_code, qr_code) VALUES ('Julia', 'Kot', '58072179546', 122078);

INSERT INTO "fever_carddto" (patient_id, date, time_of_day, pulse, temperature) VALUES (1, '2017-08-01', 0, 120.0, 36.0);
INSERT INTO "fever_carddto" (patient_id, date, time_of_day, pulse, temperature) VALUES (1, '2017-08-01', 2, 121.0, 35.0);
INSERT INTO "fever_carddto" (patient_id, date, time_of_day, pulse, temperature) VALUES (1, '2017-08-02', 0, 125.0, 37.0);
INSERT INTO "fever_carddto" (patient_id, date, time_of_day, pulse, temperature) VALUES (1, '2017-08-02', 2, 123.0, 37.0);
INSERT INTO "fever_carddto" (patient_id, date, time_of_day, pulse, temperature) VALUES (1, '2017-08-03', 0, 131.0, 36.6);
INSERT INTO "fever_carddto" (patient_id, date, time_of_day, pulse, temperature) VALUES (1, '2017-08-03', 2, 126.0, 36.9);
INSERT INTO "fever_carddto" (patient_id, date, time_of_day, pulse, temperature) VALUES (1, '2017-08-04', 0, 125.0, 37.2);
INSERT INTO "fever_carddto" (patient_id, date, time_of_day, pulse, temperature) VALUES (1, '2017-08-04', 2, 125.0, 36.4);

INSERT INTO "observationdto" (patient_id, employee, date_time, note) VALUES (1, 'Robert Warian', '2017-08-04 19:00:00.000000', 'Lorem ipsum 1');
INSERT INTO "observationdto" (patient_id, employee, date_time, note) VALUES (1, 'Robert Polska', '2017-08-04 19:20:00.000000', 'Lorem ipsum 2');
INSERT INTO "observationdto" (patient_id, employee, date_time, note) VALUES (1, 'Piotr Burneika', '2017-08-04 19:40:00.000000', 'Lorem ipsum 3');
INSERT INTO "observationdto" (patient_id, employee, date_time, note) VALUES (1, 'Robert Koźlak', '2017-08-04 19:50:00.000000', 'Lorem ipsum 4');
INSERT INTO "observationdto" (patient_id, employee, date_time, note) VALUES (1, 'Jakub Babiarz', '2017-08-04 19:55:00.000000', 'Lorem ipsum 5');
INSERT INTO "observationdto" (patient_id, employee, date_time, note) VALUES (1, 'Roman Babiarz', '2017-08-04 19:56:00.000000', 'Lorem ipsum 6');
INSERT INTO "observationdto" (patient_id, employee, date_time, note) VALUES (1, 'Robert Anioła', '2017-08-04 19:57:00.000000', 'Lorem ipsum 7');
INSERT INTO "observationdto" (patient_id, employee, date_time, note) VALUES (1, 'Piotr Anioła', '2017-08-04 20:00:00.000000', 'Lorem ipsum 8');
INSERT INTO "observationdto" (patient_id, employee, date_time, note) VALUES (1, 'Robert Anioła', '2017-08-04 21:00:00.000000', 'Lorem ipsum 9');

INSERT INTO "recommendationdto" (patient_id, date, description, morning, noon, evening, night) VALUES (1, '2017-08-04', 'Lorem ipsum 1', '08:20:00', '12:20:00', '18:20:00', '23:20:00');
INSERT INTO "recommendationdto" (patient_id, date, description, morning, noon, evening, night) VALUES (1, '2017-08-05', 'Lorem ipsum 2', '08:20:00', '12:20:00', '18:20:00', '23:20:00');
INSERT INTO "recommendationdto" (patient_id, date, description, morning, noon, evening, night) VALUES (1, '2017-08-06', 'Lorem ipsum 3', '08:20:00', '12:20:00', '18:20:00', '23:20:00');
INSERT INTO "recommendationdto" (patient_id, date, description, morning, noon, evening, night) VALUES (1, '2017-08-07', 'Lorem ipsum 4', '08:20:00', '12:20:00', '18:20:00', '23:20:00');
INSERT INTO "recommendationdto" (patient_id, date, description, morning, noon, evening, night) VALUES (1, '2017-08-08', 'Lorem ipsum 5', '08:20:00', '12:20:00', '18:20:00', '23:20:00');
INSERT INTO "recommendationdto" (patient_id, date, description, morning, noon, evening, night) VALUES (1, '2017-08-09', 'Lorem ipsum 6', '08:20:00', '12:20:00', '18:20:00', '23:20:00');
INSERT INTO "recommendationdto" (patient_id, date, description, morning, noon, evening, night) VALUES (1, '2017-08-10', 'Lorem ipsum 7', '08:20:00', '12:20:00', '18:20:00', '23:20:00');
