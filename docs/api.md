# APIs

## timeTable
### GET /timeTable
returns all data  
example
```json
{
    "timeslotList": [
        {
            "id": 1,
            "dayOfWeek": "MONDAY",
            "startTime": [
                8,
                30
            ],
            "endTime": [
                9,
                30
            ]
        },
        {
            "id": 2,
            "dayOfWeek": "MONDAY",
            "startTime": [
                9,
                30
            ],
            "endTime": [
                10,
                30
            ]
        }
    ],
    "roomList": [
        {
            "id": 11,
            "name": "Room A"
        },
        {
            "id": 12,
            "name": "Room B"
        }
    ],
    "lessonList": [
        {
            "id": 18,
            "subject": "Biology",
            "teacher": "C. Darwin",
            "studentGroup": "9th grade",
            "timeslot": null,
            "room": null
        },
        {
            "id": 14,
            "subject": "Math",
            "teacher": "A. Turing",
            "studentGroup": "9th grade",
            "timeslot": {
                "id": 1,
                "dayOfWeek": "MONDAY",
                "startTime": [
                    8,
                    30
                ],
                "endTime": [
                    9,
                    30
                ]
            },
            "room": {
                "id": 11,
                "name": "Room A"
            }
        }
    ],
    "score": "-38init/0hard/0soft",
    "solverStatus": "NOT_SOLVING"
}
```

### POST /timeTable/solve
solve problem  

### POST /timeTable/stopSolving
stop solving problem

## Lessons
### POST /lessons
add lesson  
request body:  
```json
{
    "subject": String,
    "teacher": String,
    "studentGroup": String
}
```
### DELETE /lessons/<id>
delete lesson  
id: lesson.id  

## Timeslots
### POST /timeslots  
add timeslots  
request body:  
```json
{
    "dayOfWeek": String,
    "startTime": time,
    "endTime": time
}
```

### DELETE /timeslots/<id>
delete timeslot  
id: timeslot.id  

## Rooms
### POST /rooms
add room  
request body: 
```json
{
    "name": String
}
```

### DELETE /rooms/<id>
delete room  
id: room.id 

## Subjects
### POST /subjects
add subject  
request body:  
```json
{
    "name": String
}
```

### DELETE /subjects/<id>
delete subject  
id: subject.id  

## Teachers
### POST /teachers
add teacher  
request body:
```json
{
    "name": String
}
```

### DELETE /teachers/<id>
delete teacher  
id: teacher.id  

## StudentGroups
### POST /studentGroups
add student group  
request body:
```json
{
    "name": String
}
```

### DELETE /studentGroups/<id>
delete student group  
id: studentGroup.id  
