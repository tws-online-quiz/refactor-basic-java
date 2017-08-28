package practice1;

import com.google.common.collect.ImmutableList;

/**
 * Created by jxzhong on 2017/8/28.
 */
public class Security {

    private SecurityChecker securityChecker;

    public Security(SecurityChecker checker) {
        this.securityChecker = checker;
    }

    public boolean hasAccess(User user, Permission permission, ImmutableList<Permission> permissions) {

        if (user != null) {
            if (permission != null) {
                if (permissions.size() != 0) {
                    if (this.securityChecker.checkPermission(user, permission) || permissions.contains(permission)) {
                        return true;
                    } else {
                        return securityChecker.isAdmin();
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
