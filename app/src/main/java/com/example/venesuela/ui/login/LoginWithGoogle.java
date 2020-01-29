package com.example.venesuela.ui.login;

import android.os.Bundle;

import imagineprojects.R;
/*import com.google.android.gms.common.SignInButton;


import com.google.android.gms.common.ConnectionResult;

import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
*/
/*import android.widget.Button;
import android.widget.TextView;
import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
/*
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;

import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;


import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;


import com.example.imagineprojects.R;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;




import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

 */

import androidx.appcompat.app.AppCompatActivity;

public class LoginWithGoogle extends AppCompatActivity//extends FragmentActivity implements
     //   ConnectionCallbacks, OnConnectionFailedListener,
     //   View.OnClickListener
{
/*private static final int OUR_REQUEST_CODE =1;
    private static final int SIGNED_IN = 0;
    private static final int STATE_SIGNING_IN = 1;
    private static final int STATE_IN_PROGRESS = 2;
    private static final int RC_SIGN_IN = 0;

private ConnectionResult mConnectionResult;
    private GoogleApiClient mGoogleApiClient, mGoogleSignInApiClient;
    private int mSignInProgress;
    private PendingIntent mSignInIntent;

    private SignInButton mSignInButton;
    private Button mSignOutButton;
    private Button mRevokeButton;
    private TextView mStatus;
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_google);


    }
/*
    private GoogleApiClient buildGoogleApiClient() {
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

// Build a GoogleApiClient with access to GoogleSignIn.API and the options above.
        return new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .enableAutoManage(this, this)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();

    }



    @Override
    protected void onStart() {
        super.onStart();
        mGoogleApiClient.connect();
    }

    @Override
    protected void onStop() {
        mGoogleApiClient.disconnect();
        super.onStop();
    }

    @Override
    public void onConnectionSuspended(int cause) {
        mGoogleApiClient.connect();
    }
    @Override
    public void onConnected(Bundle connectionHint) {
        mSignInButton.setEnabled(false);
        mSignOutButton.setEnabled(true);
        mRevokeButton.setEnabled(true);

        // Indicate that the sign in process is complete.
        mSignInProgress = SIGNED_IN;
        OptionalPendingResult opr =
                Auth.GoogleSignInApi.silentSignIn(mGoogleSignInApiClient);

        opr.setResultCallback(new ResultCallback<GoogleSignInResult>() {
            @Override
            public void onResult(@NonNull GoogleSignInResult result) {
                if (result.isSuccess()) {
                    try {
                        GoogleSignInAccount account = result.getSignInAccount();
                        mStatus.setText(String.format("Signed In to My App as %s", account.getEmail()));
                    }
                    catch(Exception ex){
                        String exception = ex.getLocalizedMessage();
                        String exceptionString = ex.toString();
                        // Note that you should log these errors in a ‘real' app to aid in debugging
                    }
                }
            }
//Todo наверх надо ");"
        });
    }
        //Todo

        @Override
        public void onConnectionFailed(ConnectionResult result) {
            if (mSignInProgress != STATE_IN_PROGRESS) {
                mSignInIntent = result.getResolution();
                if (mSignInProgress == STATE_SIGNING_IN) {
                    resolveSignInError();
                }
            }
            // Will implement shortly
            onSignedOut();
        }

        private void resolveSignInError() {
            if (mSignInIntent != null) {
                try {
                    mSignInProgress = STATE_IN_PROGRESS;
                    mConnectionResult.startResolutionForResult(this, OUR_REQUEST_CODE);
                } catch (IntentSender.SendIntentException e) {
                    mSignInProgress = STATE_SIGNING_IN;
                    mGoogleApiClient.connect();
                }
            } else {
                // You have a play services error -- inform the user
            }
        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case RC_SIGN_IN:
                if (resultCode == RESULT_OK) {
                    mSignInProgress = STATE_SIGNING_IN;
                } else {
                    mSignInProgress = SIGNED_IN;
                }

                if (!mGoogleApiClient.isConnecting()) {
                    mGoogleApiClient.connect();
                }
                break;
        }
    }

    private void onSignedOut() {


        Auth.GoogleSignInApi.signOut(mGoogleApiClient).setResultCallback(
                new ResultCallback<Status>() {
                    @Override
                    public void onResult(Status status) {
                        // Update the UI to reflect that the user is signed out.
                        mSignInButton.setEnabled(true);
                        mSignOutButton.setEnabled(false);
                        mRevokeButton.setEnabled(false);
                        mStatus.setText("Signed out");
                    }
                });


    }
    @Override
    public void onClick(View v) {
        if (!mGoogleApiClient.isConnecting()) {
            switch (v.getId()) {
                case R.id.sign_in_button:
                    mStatus.setText("Signing In");
                    Intent signInIntent =
                            Auth.GoogleSignInApi.getSignInIntent(mGoogleSignInApiClient);
                    startActivityForResult(signInIntent, RC_SIGN_IN);

                    break;
                case R.id.sign_out_button:
                    onSignedOut();
                    mGoogleApiClient.disconnect();
                    mGoogleApiClient.connect();
                    break;
                case R.id.revoke_access_button:
                    Auth.GoogleSignInApi.revokeAccess(mGoogleApiClient);
                    mGoogleApiClient = buildGoogleApiClient();
                    mGoogleApiClient.connect();
                    break;
            }
        }
    }
*/
        }


