//curry example-how to use
def log = {String type, Date createdOn ,String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG",new Date(),"This is first")
log("DEBUG",new Date(),"This is second")

//To overcome the reputed data curry has been introduced

def debugLog = log.curry("DEBUG")
debugLog(new Date(),"This is third")
debugLog(new Date(),"This is fourth")

//Again to avoid new Date has 2 times 

def dateWithDebugLog = log.curry("DEBUG",new Date())
dateWithDebugLog("this is fifth")

//right curry
def crazyPerson = log.rcurry("Why am I logging this way")
crazyPerson("ERROR",new Date())

//indexed based curry
def typemsgLog = log.ncurry(1,new Date())
typemsgLog("ERR","this is sixth")