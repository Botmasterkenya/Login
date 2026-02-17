<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Project Design Report - Smart Medicine Reminder</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            line-height: 1.6;
            background-color: #f4f6f9;
        }
        h1, h2, h3 {
            color: #2c3e50;
        }
        h1 {
            text-align: center;
        }
        section {
            background: #ffffff;
            padding: 20px;
            margin-bottom: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        }
        ul {
            margin-left: 20px;
        }
    </style>
</head>
<body>

<h1>Project Design Report (PDR)</h1>

<section>
    <h2>1. Project Title</h2>
    <p><strong>Smart Medicine Reminder Application</strong></p>
</section>

<section>
    <h2>2. Introduction</h2>
    <p>
        Medication adherence is a major challenge, especially for elderly individuals and patients 
        managing multiple prescriptions. Missing doses or taking medicine at the wrong time can 
        lead to serious health complications. The Smart Medicine Reminder Application is designed 
        to help users track, schedule, and receive timely reminders about their medication intake.
    </p>
</section>

<section>
    <h2>3. Problem Statement</h2>
    <ul>
        <li>Patients forget to take medicine at the correct time.</li>
        <li>Confusion between multiple medications.</li>
        <li>Missed doses due to busy schedules.</li>
        <li>Lack of a structured medication tracking system.</li>
    </ul>
    <p>
        There is a need for a simple and user-friendly digital system that reminds users 
        which medicine to take and when to take it.
    </p>
</section>

<section>
    <h2>4. Objectives</h2>
    <h3>General Objective</h3>
    <p>To develop a mobile application that reminds users when and which medicine to take.</p>

    <h3>Specific Objectives</h3>
    <ul>
        <li>Allow users to add medicine details.</li>
        <li>Set specific dosage times.</li>
        <li>Send notifications at scheduled times.</li>
        <li>Track medication history.</li>
        <li>Provide a simple and intuitive interface.</li>
    </ul>
</section>

<section>
    <h2>5. Scope of the Project</h2>
    <h3>The system will:</h3>
    <ul>
        <li>Add medicine name and dosage.</li>
        <li>Set frequency (once daily, twice daily, etc.).</li>
        <li>Choose specific reminder times.</li>
        <li>Store medicine records locally.</li>
    </ul>

    <h3>The system will NOT:</h3>
    <ul>
        <li>Provide medical diagnosis.</li>
        <li>Replace professional healthcare advice.</li>
        <li>Connect directly to hospital systems.</li>
    </ul>
</section>

<section>
    <h2>6. System Overview</h2>
    <h3>User Interface Layer</h3>
    <ul>
        <li>Add Medicine Screen</li>
        <li>Medicine List Screen</li>
        <li>Reminder Settings Screen</li>
    </ul>

    <h3>Business Logic Layer</h3>
    <ul>
        <li>Schedule time-based notifications.</li>
        <li>Validate user inputs.</li>
        <li>Manage medicine data.</li>
    </ul>

    <h3>Data Storage Layer</h3>
    <ul>
        <li>Local database (SQLite).</li>
        <li>Stores medicine name, dosage, time, and frequency.</li>
    </ul>
</section>

<section>
    <h2>7. Functional Requirements</h2>
    <ul>
        <li>Add new medicine.</li>
        <li>Edit medicine details.</li>
        <li>Delete medicine entries.</li>
        <li>Trigger notifications at specified times.</li>
        <li>Mark medicine as “Taken”.</li>
        <li>Display daily medication schedule.</li>
    </ul>
</section>

<section>
    <h2>8. Non-Functional Requirements</h2>
    <ul>
        <li>Simple and easy-to-use interface.</li>
        <li>Fast response time.</li>
        <li>Secure data storage.</li>
        <li>Low battery consumption.</li>
        <li>Reliable notification system.</li>
    </ul>
</section>

<section>
    <h2>9. Tools and Technologies</h2>
    <ul>
        <li>Programming Language: Kotlin</li>
        <li>IDE: Android Studio</li>
        <li>Database: Room (SQLite)</li>
        <li>Notification System: AlarmManager / WorkManager</li>
        <li>UI: XML or Jetpack Compose</li>
    </ul>
</section>

<section>
    <h2>10. System Flow</h2>
    <ol>
        <li>User installs the application.</li>
        <li>User adds medicine details.</li>
        <li>User sets reminder time.</li>
        <li>System stores data.</li>
        <li>Notification appears at scheduled time.</li>
        <li>User confirms medicine intake.</li>
    </ol>
</section>

<section>
    <h2>11. Expected Output</h2>
    <ul>
        <li>Timely medicine reminders.</li>
        <li>Reduced missed doses.</li>
        <li>Organized medication tracking.</li>
        <li>Improved medication adherence.</li>
    </ul>
</section>

<section>
    <h2>12. Future Improvements</h2>
    <ul>
        <li>Cloud backup support.</li>
        <li>Doctor sharing feature.</li>
        <li>SMS reminders.</li>
        <li>Voice assistant integration.</li>
        <li>AI-based smart scheduling.</li>
    </ul>
</section>

<section>
    <h2>13. Conclusion</h2>
    <p>
        The Smart Medicine Reminder Application provides a practical solution to medication 
        management challenges. It ensures users take the correct medicine at the correct time, 
        improving health outcomes and supporting better medication adherence.
    </p>
</section>

</body>
</html>
