def call(id,user,ip,war){
    sshagent([id]){
    sh 'scp -o StrictHostKeyChecking=no target/${war} ${user}@${ip}:/opt/TOMCAT9/webapps'
    sh 'ssh ${user}@${ip} /opt/TOMCAT9/bin/startup.sh'
    
    }
}
